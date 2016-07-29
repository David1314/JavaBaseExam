用命令进入每个项目所在的根目录，然后运行一下代码：
mvn clean compile exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"