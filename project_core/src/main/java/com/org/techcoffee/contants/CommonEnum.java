package com.org.techcoffee.contants;

import java.util.ArrayList;
import java.util.List;

import com.org.techcoffee.base.util.MyMap;

public final class CommonEnum {

	/** 不提供构造函数 */
	private CommonEnum() {
	}

	/**
	 * 性别
	 */
	public enum SexStatus implements IEnum {
		/** 男 */
		MALE("男", "1"),
		/** 女 */
		FEMALE("女", "2"),
		/** 保密 */
		SECRIT("保密", "9");

		/** 值 */
		private String label;

		/** 键 */
		private String code;

		/**
		 * 取得枚举区分
		 * 
		 * @return String
		 */
		public String getEnumName() {
			return "SexStatus";
		}

		/**
		 * 构造函数
		 * 
		 * @param label
		 *            String
		 * @param code
		 *            String
		 */
		private SexStatus(String label, String code) {
			this.label = label;
			this.code = code;
		}

		/**
		 * 根据键取得值
		 * 
		 * @param code
		 *            String
		 * @return String
		 */
		public static String getEnumLabel(String code) {
			for (SexStatus c : SexStatus.values()) {
				if (c.getCode().equals(code)) {
					return c.label;
				}
			}
			return null;
		}

		/**
		 * 根据值取得第一个匹配的键
		 * 
		 * @param label
		 *            String
		 * @return String
		 */
		public static String getEnumCode(String label) {
			for (SexStatus c : SexStatus.values()) {
				if (c.getLabel().equals(label)) {
					return c.code;
				}
			}
			return null;
		}

		/**
		 * 取得下拉框列表
		 * 
		 * @return List
		 */
		public static List<MyMap> getList() {
			List<MyMap> resultList = new ArrayList<MyMap>();
			for (SexStatus c : SexStatus.values()) {
				MyMap dto = new MyMap();
				dto.setKey(c.getCode());
				dto.setValue(c.getLabel());
				resultList.add(dto);
			}
			return resultList;
		}

		/**
		 * get
		 * 
		 * @return String
		 */
		public String getLabel() {
			return label;
		}

		/**
		 * set
		 * 
		 * @return String
		 */
		public String getCode() {
			return code;
		}

		/**
		 * String转换，中间加横杠
		 * 
		 * @return String
		 */
		@Override
		public String toString() {
			return this.label;
		}

		/**
		 * 转换成value
		 * 
		 * @return String
		 */
		public String toValueString() {
			return String.valueOf(this.code);
		}

		/**
		 * 转换成label
		 * 
		 * @return String
		 */
		public String toLabelString() {
			return String.valueOf(this.label);
		}
	}

}
