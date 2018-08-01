package com.common.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component(value = "dateConvert")
public class DateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String strDate) {

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat simpleDateFormat1s = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormat1sp = new SimpleDateFormat(
				"MM-dd-yyyy HH:mm:ss");
		SimpleDateFormat simpleDateFormat1spp = new SimpleDateFormat(
				"MM-dd-yyyy");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat simpleDateFormat2s = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat simpleDateFormat2sp = new SimpleDateFormat(
				"MM/dd/yyyy HH:mm:ss");
		SimpleDateFormat simpleDateFormat2spp = new SimpleDateFormat(
				"MM/dd/yyyy");
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(
				"yyyy_MM_dd HH:mm:ss");
		SimpleDateFormat simpleDateFormat3s = new SimpleDateFormat("yyyy_MM_dd");
		SimpleDateFormat simpleDateFormat3sp = new SimpleDateFormat(
				"MM_dd_yyyy HH:mm:ss");
		SimpleDateFormat simpleDateFormat3spp = new SimpleDateFormat(
				"MM_dd_yyyy");

		if (null != strDate) {
			/**** 【-】 年月日 月日年 ******/
			if (strDate.contains("-")) {
				if (strDate.substring(0, strDate.indexOf("-")).length() > 2) {// 年月日
					if (strDate.contains(":")) {
						try {
							return simpleDateFormat1.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						try {
							return simpleDateFormat1s.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				} else {// 月日年
					if (strDate.contains(":")) {
						try {
							return simpleDateFormat1sp.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						try {
							return simpleDateFormat1spp.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				}
			}

			/**** 【/】 年月日 月日年 ******/
			if (strDate.contains("/")) {
				if (strDate.substring(0, strDate.indexOf("/")).length() > 2) {// 年月日
					if (strDate.contains(":")) {
						try {
							return simpleDateFormat2.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						try {
							return simpleDateFormat2s.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				} else {// 月日年
					if (strDate.contains(":")) {
						try {
							return simpleDateFormat2sp.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						try {
							return simpleDateFormat2spp.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				}
			}

			/**** 【_】 年月日 月日年 ******/
			if (strDate.contains("_")) {
				if (strDate.substring(0, strDate.indexOf("_")).length() > 2) {// 年月日
					if (strDate.contains(":")) {
						try {
							return simpleDateFormat3.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						try {
							return simpleDateFormat3s.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				} else {// 月日年
					if (strDate.contains(":")) {
						try {
							return simpleDateFormat3sp.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					} else {
						try {
							return simpleDateFormat3spp.parse(strDate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

}
