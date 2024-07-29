package com.jensen;


import org.junit.Test;

public class HelloWorldTest {

   @Test
   public void testSayHello(){
      HelloWorld helloWorld = new HelloWorld();
      helloWorld.sayHello("Maven");
   }
}
