run:
	gradle clean build
	docker build -t springboot .
	docker run --rm springboot