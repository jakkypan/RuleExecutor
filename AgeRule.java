package com.panda.myapplication.rule2;

/**
 * @author panda
 * created at 2021/10/13 2:07 下午
 */
public class AgeRule extends AbstractRule {
	@Override
	public boolean execute(RuleDto dto) {
		System.out.println("AgeRule invoke!");
		if (dto.getAge() >= 18) {
			return true;
		}
		return false;
	}
}
