docker_build:
	docker build -t simple:v1 ./

docker_run:
	docker run -p 8080:8080 -t simple:v1
