all:
	activator stage

run:
	killall -9 java
	target/universal

log:
	tailf logs/application.log