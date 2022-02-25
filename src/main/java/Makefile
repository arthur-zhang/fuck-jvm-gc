clean:
	rm -rf *.class

java=/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java

NewSizeDemo1:clean
	javac NewSizeDemo1.java
	$(java) -server -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:ParallelGCThreads=4  -XX:+PrintGCDetails -XX:+PrintGCDateStamps NewSizeDemo1
NewSizeDemo1_heap:
	jcmd $(shell sh -c "jps | grep NewSizeDemo1 | cut -d ' ' -f 1") GC.heap_info

YGCDemo1:clean
	javac YGCDemo1.java
	$(java) -server -Xmn400m -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  YGCDemo1

YGCDemo1_with_print:clean
	javac YGCDemo1.java
	$(java) -server -Xmn400m -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseConcMarkSweepGC -XX:+PrintTenuringDistribution YGCDemo1

YGCDemo2:clean
	javac YGCDemo2.java
	$(java) -server -Xmn400m -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -cp . YGCDemo2

YGCDemo2_with_reference:clean
	javac YGCDemo2.java
	$(java) -server -Xmn400m -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+PrintReferenceGC   -XX:+UseConcMarkSweepGC -cp . YGCDemo2

YGCDemo4:clean
	javac YGCDemo4.java
	$(java)  -Xms2g -Xmx2g -Xmn100M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseConcMarkSweepGC -XX:+PrintStringTableStatistics -cp . YGCDemo4

YGCDemo4_GC:clean
	jcmd $(shell sh -c "jps | grep YGCDemo4 | cut -d ' ' -f 1") GC.run

YGCDemo5:clean
	javac -cp ../../../lib/jackson-core-2.13.1.jar:../../../lib/jackson-databind-2.13.1.jar:. YGCDemo5.java
	$(java) -Xms2g -Xmx2g -Xmn100M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseConcMarkSweepGC -XX:+PrintStringTableStatistics -cp ../../../lib/jackson-core-2.13.1.jar:../../../lib/jackson-databind-2.13.1.jar:../../../lib/jackson-annotations-2.13.1.jar:. YGCDemo5

CmsGCDemo0:clean
	$(java) -server -Xms2g -Xmx2g -Xmn600m -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -jar ../../../target/demo1-0.0.1-SNAPSHOT.jar

CmsGCDemo0_heap:
	jcmd $(shell sh -c "jps | grep demo1-0.0.1-SNAPSHOT.jar | cut -d ' ' -f 1") GC.heap_info

CmsGCDemo1:clean
	javac CmsGCDemo1.java
	$(java) -server -Xms2g -Xmx2g -Xmn200m -Xss1024K -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC   -cp . CmsGCDemo1

CmsGCDemo2:clean
	javac CmsGCDemo2.java
	$(java) -server -Xms2g -Xmx2g -Xmn200m -Xss1024K -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -cp . CmsGCDemo2

CmsGCDemo3:clean
	javac CmsGCDemo3.java
	$(java) -Xmx2000m -Xms2000m -Xmn1000m  -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC   -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=75 -cp . CmsGCDemo3

CmsGCDemo4:clean
	javac CmsGCDemo4.java
	$(java) -Xmx2000m -Xms2000m -Xmn1000m  -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:PretenureSizeThreshold=100m -cp . CmsGCDemo4


CmsGCDemo5:clean
	javac CmsGCDemo5.java
	$(java) -Xmx2000m -Xms2000m -Xmn1000m  -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:PretenureSizeThreshold=10m  -XX:+UseCMSInitiatingOccupancyOnly -cp . CmsGCDemo5

CmsGCDemo0_fix:clean
	$(java) -server -Xms2g -Xmx2g -Xmn600m -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:MetaspaceSize=32m -XX:MaxMetaspaceSize=40m  -jar ../../../target/demo1-0.0.1-SNAPSHOT.jar

FinalizerTest:clean
	javac FinalizerTest.java
	$(java) -server -Xmn400M -XX:SurvivorRatio=8 -Xms1024M -Xmx1024M -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -XX:+PrintReferenceGC -cp . FinalizerTest
