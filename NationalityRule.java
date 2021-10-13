package com.panda.myapplication.rule2;

import static com.panda.myapplication.rule2.RuleConstant.MATCH_ADDRESS_START;
import static com.panda.myapplication.rule2.RuleConstant.MATCH_NATIONALITY_START;

/**
 * @author panda
 * created at 2021/10/13 2:12 下午
 */
public class NationalityRule extends AbstractRule {

	@Override
	protected <T> T convert(RuleDto dto) {
		NationalityRuleDto nationalityRuleDto = new NationalityRuleDto();
		if (dto.getAddress().startsWith(MATCH_ADDRESS_START)) {
			nationalityRuleDto.setNationality(MATCH_NATIONALITY_START);
		}
		return (T) nationalityRuleDto;
	}


	@Override
	protected <T> boolean executeRule(T t) {
		System.out.println("NationalityRule invoke!");
		NationalityRuleDto nationalityRuleDto = (NationalityRuleDto) t;
		if (nationalityRuleDto.getNationality().startsWith(MATCH_NATIONALITY_START)) {
			return true;
		}
		return false;
	}
}