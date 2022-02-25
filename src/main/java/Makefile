clean:
	rm -rf *.class



# 	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xmn400M -XX:SurvivorRatio=9 -Xms1000M -Xmx1000M -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintTenuringDistribution -XX:+PrintHeapAtGC -XX:+PrintReferenceGC  -XX:+UseConcMarkSweepGC PromotionTest

NewSizeDemo1:clean
	javac NewSizeDemo1.java
	#/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server  -Xms1g -Xmx1g  -XX:+UseConcMarkSweepGC -XX:ParallelGCThreads=4 NewSizeDemo1
	java -server  -Xms1g -Xmx1g -XX:+UseConcMarkSweepGC -XX:ParallelGCThreads=4                -XX:CMSTriggerInterval=0 -XX:+PrintGCDetails -XX:+PrintGCDateStamps NewSizeDemo1

NewSizeDemo1_test:
	jcmd `jps | grep NewSizeDemo1 | awk '{print $1}'` GC.heap_info

	#/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xmn400M -XX:SurvivorRatio=8 -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintTenuringDistribution   -XX:+UseConcMarkSweepGC PromotionTest
YGCDemo1:clean
	javac YGCDemo1.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xmn400m -Xms1g -Xmx1g -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -XX:+PrintTenuringDistribution   YGCDemo1

YGCDemo2:clean
	javac YGCDemo2.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xmn400M -XX:SurvivorRatio=8 -Xms1024M -Xmx1024M -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+PrintReferenceGC   -XX:+UseConcMarkSweepGC -cp . YGCDemo2

YGCDemo2_2:clean
	javac YGCDemo2.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xmn400M -XX:SurvivorRatio=8 -Xms1024M -Xmx1024M -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -cp . YGCDemo2

FinalizerTest:clean
	javac FinalizerTest.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xmn400M -XX:SurvivorRatio=8 -Xms1024M -Xmx1024M -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC -XX:+PrintReferenceGC -cp . FinalizerTest


YGCDemo3:clean
	javac YGCDemo3.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xms4g -Xmx4g -Xmn2g -Xss1024K -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -cp . YGCDemo3
YGCDemo4:clean
	javac YGCDemo4.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java  -Xms2g -Xmx2g -Xmn100M -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:+PrintStringTableStatistics -cp . YGCDemo4


CmsGCDemo1:clean
	javac CmsGCDemo1.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xms2g -Xmx2g -Xmn200m -Xss1024K -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC   -cp . CmsGCDemo1

CmsGCDemo2:clean
	javac CmsGCDemo2.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -server -Xms2g -Xmx2g -Xmn200m -Xss1024K -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -cp . CmsGCDemo2

CmsGCDemo3:clean
	javac CmsGCDemo3.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -Xmx2000m -Xms2000m -Xmn1000m   -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC   -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=75 -cp . CmsGCDemo3
CmsGCDemo3_1:clean
	javac CmsGCDemo3.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -Xmx20m -Xms20m -Xmn10m   -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:+PrintTenuringDistribution  -cp . CmsGCDemo3

CmsGCDemo3_2:clean
	javac CmsGCDemo3.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -Xmx20m -Xms20m -Xmn10m   -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=75 -cp . CmsGCDemo3

CmsGCDemo4:clean
	javac CmsGCDemo4.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -Xmx2000m -Xms2000m -Xmn1000m  -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:PretenureSizeThreshold=100m -cp . CmsGCDemo4


CmsGCDemo5:clean
	javac CmsGCDemo5.java
	/Users/arthur/cvt_dev/jvm/jdk-debug/jvm_home/jdk8u322-b06/Contents/Home/bin/java -Xmx2000m -Xms2000m -Xmn1000m  -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -XX:+PrintGCDateStamps  -XX:+UseConcMarkSweepGC  -XX:PretenureSizeThreshold=10m  -XX:+UseCMSInitiatingOccupancyOnly -cp . CmsGCDemo5

