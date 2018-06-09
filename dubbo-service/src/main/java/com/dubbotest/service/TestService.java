package com.dubbotest.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

@Service(timeout = 1500,retries = 3)
public class TestService implements ITestService{
    public int getHash(String s) {
        HashFunction hf = Hashing.murmur3_128(); // 32bit version available as well
        HashCode hc = hf.newHasher()
                .putString(s, Charsets.UTF_8)
                .hash();
        return hc.asInt();
    }
}
