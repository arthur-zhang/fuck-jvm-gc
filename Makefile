
CmsGCDemo0:
	#mvn clean package -DskipTests
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xms2g -Xmx2g -Xmn600m -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -jar target/demo1-0.0.1-SNAPSHOT.jar


CmsGCDemo0_2:
	#mvn clean package -DskipTests
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -Xms2g -Xmx2g -Xmn600m -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:MetaspaceSize=40m -XX:MaxMetaspaceSize=40m -jar target/demo1-0.0.1-SNAPSHOT.jar
