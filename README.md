# java8
The code, currently, is limited to Asynchronous programming using Java 8.

Learnings
	- get vs. getNow (Main.java)
	- Thread of execution (Main2.java)
	- Changing the pool (Main3.java)
	- Async vs. non-async (Main4.java)
		○ In parallel streams, entire pipeline is condemned to run in a single thread.
		○ It's not case with CompletableFuture.
	- thenAccept (Main5.java)
	- thenApply (Main5.java)
	- Build a pipeline and execute it later on. (Main6.java)
							} Watch at 1:53
	- Stream is zero or more streams operation; whereas CompletableFuture - one sequence where it goes through. Once it goes through that sequence it either completes or get cancelled.
		○ Promises are zero or one piece of data or an exception.
		○ Observables are zero or many pieces/streams of data.
	- Exception Handling (Main7.java)

Combine (starts at 2:14)
