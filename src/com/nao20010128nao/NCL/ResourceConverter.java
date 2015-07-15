package com.nao20010128nao.NCL;

import java.io.IOException;
import java.io.InputStream;

public abstract class ResourceConverter {

	public ResourceConverter() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public abstract InputStream convert(InputStream is, String address)
			throws IOException;

	public static final ResourceConverter NULL_CONVERTER = new ResourceConverter() {

		@Override
		public InputStream convert(InputStream is, String address)
				throws IOException {
			// TODO 自動生成されたメソッド・スタブ
			return is;
		}
	};
}
