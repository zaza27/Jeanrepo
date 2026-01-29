import getpass
import os
import subprocess

classManager(object):

def __init__(self, args, logger):
    self.args = args
    self.running_user = getpass.getuser()
    self.logger = logger


def manage(self):
    if self.args is None:
        return 1

else:
name = self.args['method'].lower()
method = getattr(self, name) if name in ['help', 'create'] else None
if method is None:
    return 1

return method()


@staticmethod
def help():

    print('Usage: dirmanage CONTROL-FILE\n' +
          'Or: dirmanage\n'
          '    [help]\n' +
          '    [create [-s START-PATH] -p PATH...]\n' +
          '\n' +
          'Command flags:\n' +
          '    -s, --startFrom START-PATH		' +
          'optional: designate a top level directory to start creation in\n' +
          '    -p, --fromPaths PATH [PATH ...]    ' +
          'use a list of paths from command line instead of reading from file\n' +
          '\n' +
          'The general expanded command line syntax is:\n' +
          '    dirmanage [command] [arguments]\n')

    return 0


def create(self):
    paths = self.load_paths()
    for path in paths:
        file_system = self.args['file_system']
        if file_system.lower() == 'hdfs':
            print('Creating directory on HDFS: %s ...' % path),
            self.logger.info('Creating directory on HDFS: %s, as user: %s', path,
                             self.running_user)

            with open(os.devnull, 'w') as devnull:
                if subprocess.call(['hdfs', 'dfs', '-mkdir', '-p', path],
                                   stdout=devnull, stderr=devnull) is not 0:
                    print
                    'FAILED. Exiting'
                    self.logger.error('Failed to create directory on HDFS: %s', path)
                    return 1

                print
                'SUCCESS'
                self.logger.info('Successfully created directory on HDFS: %s, as user: %s',
                                 path, self.running_user)

                with open(os.devnull, 'w') as devnull:
                    if subprocess.call(['mkdir', '-p', path],
                                       stdout=devnull, stderr=devnull) is not 0:
                        print
                        'FAILED. Exiting'
                        self.logger.error('Failed to create directory on locally: %s',
                                          path)
                        return 1

                        print
                    'SUCCESS'
                    self.logger.info(
                        'Successfully created directory on locally: %s, as user: %s',
                        path, self.running_user)

    return 0


def load_paths(self):
    return [self.args['top'] + path for path in self.args['paths']]