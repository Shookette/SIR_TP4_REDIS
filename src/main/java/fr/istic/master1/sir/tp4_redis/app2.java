package fr.istic.master1.sir.tp4_redis;

import redis.clients.jedis.Jedis;

public class app2 {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println(jedis.get("counter"));
		jedis.incr("counter");
		System.out.println(jedis.get("counter"));
	}

}
