all:
	activator stage

run:
	killall -9 java
	rm target/universal/stage/RUNNING_PID
	(target/universal/stage/bin/character-sheets-new-website > logs/application.log &)

log:
	tailf logs/application.log