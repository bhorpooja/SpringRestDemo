package com.codekul.SpringRestDemo.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by pooja on 8/12/17.
 */
public class Dept {

    @Id
    String did;
    String dname;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }


    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
