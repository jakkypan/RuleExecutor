package com.panda.myapplication.rule2;

/**
 * @author panda
 * created at 2021/10/13 2:03 下午
 */
public abstract class AbstractRule implements BaseRule {

	protected <T> T convert(RuleDto dto) {
		return (T) dto;
	}

	@Override
	public boolean execute(RuleDto dto) {
		return executeRule(convert(dto));
	}

	protected <T> boolean executeRule(T t) {
		return true;
	}
}