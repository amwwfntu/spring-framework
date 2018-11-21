package com.hwk.service.impl;

import com.hwk.service.IndexService;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
	@Override
	public void query() {
		System.out.println("indexserviceimpl");
	}
}
