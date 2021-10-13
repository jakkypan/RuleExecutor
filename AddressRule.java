package com.panda.myapplication.rule2;

import static com.panda.myapplication.rule2.RuleConstant.MATCH_ADDRESS_START;

/**
 * @author panda
 * created at 2021/10/13 2:04 下午
 */
public class AddressRule extends AbstractRule {

	@Override
	public boolean execute(RuleDto dto) {
		System.out.println("AddressRule invoke!");
		if (dto.getAddress().startsWith(MATCH_ADDRESS_START)) {
			return true;
		}
		return false;
	}
}