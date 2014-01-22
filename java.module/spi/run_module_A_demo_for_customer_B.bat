set startdir=%cd%
set CLASSPATH=%startdir%\module_A_demo\target\module_A_demo-1.0.0-SNAPSHOT.jar;%startdir%\module_A\target\module_A-1.0.0-SNAPSHOT.jar;%startdir%\module_A_customer_B\target\module_A_customer_B-1.0.0-SNAPSHOT.jar

java ro.ima.kb.hello.ModuleADemo