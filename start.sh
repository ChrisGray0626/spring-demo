#!/usr/bin/env bash
#!/bin/sh
# 设置jar包
RESOURCE_NAME=sanming-planning-server-1.0-SNAPSHOT.jar
# 查询当前进程号
pid=`ps -ef|grep $RESOURCE_NAME|grep -v grep|grep -v kill|awk '{print $2}'`
if [ ${pid} ]; then
echo 'Kill Process!'
kill -9 $pid
else
echo 'Process does not exist!'
fi
# 删除保存进程号的文件
rm -f pid
# 启动jar包
nohup java -jar ./$RESOURCE_NAME &
# 输出最后运行的后台进程的进程号
echo $! > pid
echo 'Start Success!'
