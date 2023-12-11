package com.ogh.support.bean;

import com.ogh.frame.bean.BaseBean;

import java.util.List;

/**
 * @describe 文章实体类
 */
public class WenZhangBean extends BaseBean {

    public DataBean data;

    public static class DataBean {

        public List<DatasBean> datas;

        public static class DatasBean {

            public String title;
        }
    }

    @Override
    public boolean isEmpty() {
        return null == data.datas || data.datas.isEmpty();
    }
}