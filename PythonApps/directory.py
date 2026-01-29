import os

try:
    os.mkdir("C:/Users/WAQW/Desktop/UtilityFolder")
except OSError:
    print ("FAILED. Exiting")
else:
    print ("SUCCESS. Successful created directory on HDFS.")
