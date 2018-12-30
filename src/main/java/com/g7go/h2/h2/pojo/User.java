package com.g7go.h2.h2.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 作用描述
 *
 * @Author: Mr_li
 * @CreateDate: 2018-12-27$ 14:48$
 * @Version: 1.0
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String useMame;

    private String useSex;

    private int useAge;

    private String useIdNo;

    private String usePhoneNum;

    private String useEmail;

    private Date createTime;

    private Date modifyTime;

    private String useState;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUseMame() {
        return useMame;
    }

    public void setUseMame(String useMame) {
        this.useMame = useMame;
    }

    public String getUseSex() {
        return useSex;
    }

    public void setUseSex(String useSex) {
        this.useSex = useSex;
    }

    public int getUseAge() {
        return useAge;
    }

    public void setUseAge(int useAge) {
        this.useAge = useAge;
    }

    public String getUseIdNo() {
        return useIdNo;
    }

    public void setUseIdNo(String useIdNo) {
        this.useIdNo = useIdNo;
    }

    public String getUsePhoneNum() {
        return usePhoneNum;
    }

    public void setUsePhoneNum(String usePhoneNum) {
        this.usePhoneNum = usePhoneNum;
    }

    public String getUseEmail() {
        return useEmail;
    }

    public void setUseEmail(String useEmail) {
        this.useEmail = useEmail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getUseState() {
        return useState;
    }

    public void setUseState(String useState) {
        this.useState = useState;
    }
}
