package com.panda.myapplication.rule2;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author panda
 * created at 2021/10/13 2:14 下午
 */
public class RuleServiceTest {
	public static void main(String[] args) {
		//1. 定义规则  init rule
		AgeRule ageRule = new AgeRule();
		NationalityRule nationalityRule = new NationalityRule();
		AddressRule addressRule = new AddressRule();

		//2. 构造需要的数据 create dto
		RuleDto dto = new RuleDto();
		dto.setAge(25);
		dto.setAddress("北京");

		//3. 通过以链式调用构建和执行 rule execute
		boolean ruleResult = RuleService
				.create()
				.and(Arrays.asList(nationalityRule, addressRule))
				.or(Collections.singletonList(ageRule))
				.execute(dto);
		System.out.println("this student rule execute result :" + ruleResult);
	}
}
