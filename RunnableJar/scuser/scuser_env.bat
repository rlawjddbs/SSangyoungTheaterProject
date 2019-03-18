rem path - 특정 프로그램 (javac.exe, java.exe)를 설치된 경로에 상관없이 사용하기 위해 path 설정

rem xxx_home - 프로그램끼리 경로를 참조하기 위해 설정하는 path
set dev_home=C:\dev
set java_home=%dev_home%\Java\jdk1.8.0_191

set path=%java_home%\bin;

set classpath=.;%dev_home%\drivers\ojdbc6.jar
