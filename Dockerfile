FROM centos:7

RUN yum install epel-release -y &&yum install nginx -y&&yum install git -y&&yum install java-1.8.0-openjdk -y&& yum clean all

RUN mkdir -p /home/admin/app&&cd /home/admin/app&&git init&&git pull https://github.com/bzksx2/justdemo.git

CMD cd /home/admin/app && git pull https://github.com/bzksx2/justdemo.git \
	&& nginx -c /home/admin/app/src/main/sys-config/nginx.conf \
	&& java -jar /home/admin/app/src/main/jar/demo-0.0.1-SNAPSHOT.jar