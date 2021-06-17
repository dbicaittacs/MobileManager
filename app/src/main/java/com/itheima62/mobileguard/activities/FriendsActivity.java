package com.itheima62.mobileguard.activities;

import com.itheima62.mobileguard.domain.ContantBean;
import com.itheima62.mobileguard.engine.ReadContantsEngine;

import java.util.List;

/**
 * @author Administrator
 * 显示所有好友信息的界面
 */
public class FriendsActivity extends BaseFriendsCallSmsActivity {

	/* (non-Javadoc)
	 * 提取数据的方法,需要覆盖此方法完成数据的显示
	 * @see com.itheima62.mobileguard.activities.BaseFriendsCallSmsActivity#getDatas()
	 */
	@Override
	public List<ContantBean> getDatas() {
		return ReadContantsEngine.readContants(getApplicationContext());
	}
	
	
	
}
