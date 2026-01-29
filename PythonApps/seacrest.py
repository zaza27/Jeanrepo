import os
import inspect
import logging


path = "C:/Users/WAQW/Desktop/TechPro/Tech/Pro"

try: 
    os.removedirs(path)
    
except IOError:
    print ("FAILED:")
    print ("Directory contain files, couldn't be delete")
    
else:
    print("SUCCESS:")
    print("Successful deleted directory on the Desktop")


def function_logger(file_level, console_level=None):
    function_name = inspect.stack()[1][3]
    logger = logging.getLogger(function_name)
    logger.setLevel(logging.DEBUG)  #By default, logs all messages

    if console_level !=None:
        ch = logging.StreamHandler()    #StreamHandler logs to console
        ch.setLevel(console_level)
        ch_format = logging.Formatter('%(asctime)s - %(message)s')
        ch.setFormatter(ch_format)
        logger.addHandler(ch)

    fh = logging.FileHandler("{0}.log".format(function_name))
    fh.setLevel(file_level)
    fh_format = logging.Formatter('%(asctime)s - %(lineno)d - %(levelname)-8s - %(message)s')
    fh.setFormatter(fh_format)
    logger.addHandler(fh)

    return logger


def f1():
    f1_logger = function_logger(logging.DEBUG, logging.ERROR)
    f1_logger.error(path)


def f2():
    f2_logger = function_logger(logging.WARNING)
    f2_logger.error("Creation of the directory %s failed" % path)
   

def main():
    f1()
    f2()
    logging.shutdown()


main()
