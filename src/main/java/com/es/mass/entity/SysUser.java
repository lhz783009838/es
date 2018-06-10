package com.es.mass.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author linhzh
 * @since 2018-06-10
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 加密秘钥
     */
    private String salt;
    /**
     * 用户类型：0：物建人1：群防人员
     */
    private Integer type;
    /**
     * 身份证号码
     */
    private String card;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 性别 0：男 1：女
     */
    private Integer sex;
    /**
     * 警号
     */
    private String policeCode;
    /**
     * 用户星级
     */
    private Integer starLevel;
    /**
     * 用户来源：0:协警、1:保安、2:义务交警、3:义务反扒队员、4:110随手拍
     */
    private Integer source;
    /**
     * 创建时间
     */
    private Long createdTime;
    /**
     * 修改时间
     */
    private Long updatedTime;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 修改人
     */
    private String updator;
    /**
     * 资源路径
     */
    private String rpath;
    /**
     * 状态0:新建:1:启用:2:停用3:逻辑删除
     */
    private Integer status;
    /**
     * 用工方式(1.与保安公司签订合同；2.与劳务派遣公司签订合同；3.与公安机关签订合同；4.与街道签订合同；5.与乡镇签订合同；6.其他（请注明具体情况）)
     */
    private Integer staffType;
    /**
     * 入职时间。格式：yyyyMMdd
     */
    private Long hiredate;
    /**
     * 户籍地
     */
    private String residencet;
    /**
     * 现住地
     */
    private String domicile;
    /**
     * 学历1.初中2.高中；3.中专；4.大专；5.大学本科。
     */
    private Integer degree;
    /**
     * 经费来源1.市、区各50%保障；2.市、区、街道（乡镇）各1/3保障；3.市50%、区、街道（乡镇）各25%保障；4.区、街道（乡镇）各50%保障；5.区75%、街道（乡镇）25%保障；6.市财政100%保障；7.区财政100%保障；8.街道（乡镇）100%保障；9.其他（请注明具体情况）。
     */
    private String salarySource;
    /**
     * 婚姻状况1.未婚2.已婚3.离异4.丧偶
     */
    private Integer marital;
    /**
     * 备注
     */
    private String remark;
    /**
     * 党团关系1.共产党员；2.共青团员；3.民主党派；4.群众。
     */
    private Integer league;
    /**
     * 基本工资(以年度财务发放数字为准，以阿拉伯数字填写)
     */
    private Float salary;
    /**
     * 排序号
     */
    private Long orderNum;
    /**
     * 身份证正面
     */
    private String cardFront;
    /**
     * 身份证反面
     */
    private String cardBack;
    /**
     * 个人近照
     */
    private String cardPhoto;
    /**
     * 工作单位
     */
    private String workUnit;
    /**
     * 职位
     */
    private String occupation;
    /**
     * 手机号码
     */
    private String telephone;
    /**
     * 推荐人电话
     */
    private String referrer;
    private String birthday;
    /**
     * 专业
     */
    private String major;
    /**
     * 特长
     */
    private String specialty;
    /**
     * 主要简历
     */
    private String resume;
    /**
     * 所在地区
     */
    private String area;
    /**
     * 民族
     */
    private String nation;
    /**
     * ios的token
     */
    private String iosToken;
    /**
     * 是否在逃，1:是  0:否
     */
    private Integer ztStatus;
    /**
     * 是否有前科，1:是  0:否
     */
    private Integer wfStatus;
    /**
     * 是否人证一致，1:是  0:否
     */
    private Integer idCheckStatus;
    /**
     * 人口库base64照片
     */
    private String idCheckPhoto;
    /**
     * 用户的logo
     */
    private Integer logo;
    /**
     * 背审照片
     */
    private Integer idCheck;
    /**
     * 是否同一个人，0:是  1:否
     */
    private Integer pairResult;
    /**
     * 相似度
     */
    private String pairSimilarity;
    /**
     * 是否已确认手机号码，1:是 2:否
     */
    private Integer telStatus;
    /**
     * 认证方式 0：二代身份证认证；1：人像在线对比认证
     */
    private Integer authType;
    /**
     * 认证结果 0：成功；1：失败
     */
    private Integer authResult;
    /**
     * 注册地址
     */
    private String registAddr;
    /**
     * 注册审核通过提示
     */
    private Integer loginStatus;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 个性签名
     */
    private String signature;
    /**
     * 昵称设置提示
     */
    private Integer nicknameStatus;
    /**
     * 注册信息来源：0：app客户端，1：微信
     */
    private Integer userAgentType;
    /**
     * 同步内网标识：1已同步，空或0：未同步，2：同步失败
     */
    private Integer syncStatus;
    /**
     * 同步结果
     */
    private String syncMessage;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPoliceCode() {
        return policeCode;
    }

    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public String getRpath() {
        return rpath;
    }

    public void setRpath(String rpath) {
        this.rpath = rpath;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStaffType() {
        return staffType;
    }

    public void setStaffType(Integer staffType) {
        this.staffType = staffType;
    }

    public Long getHiredate() {
        return hiredate;
    }

    public void setHiredate(Long hiredate) {
        this.hiredate = hiredate;
    }

    public String getResidencet() {
        return residencet;
    }

    public void setResidencet(String residencet) {
        this.residencet = residencet;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getSalarySource() {
        return salarySource;
    }

    public void setSalarySource(String salarySource) {
        this.salarySource = salarySource;
    }

    public Integer getMarital() {
        return marital;
    }

    public void setMarital(Integer marital) {
        this.marital = marital;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLeague() {
        return league;
    }

    public void setLeague(Integer league) {
        this.league = league;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public String getCardFront() {
        return cardFront;
    }

    public void setCardFront(String cardFront) {
        this.cardFront = cardFront;
    }

    public String getCardBack() {
        return cardBack;
    }

    public void setCardBack(String cardBack) {
        this.cardBack = cardBack;
    }

    public String getCardPhoto() {
        return cardPhoto;
    }

    public void setCardPhoto(String cardPhoto) {
        this.cardPhoto = cardPhoto;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIosToken() {
        return iosToken;
    }

    public void setIosToken(String iosToken) {
        this.iosToken = iosToken;
    }

    public Integer getZtStatus() {
        return ztStatus;
    }

    public void setZtStatus(Integer ztStatus) {
        this.ztStatus = ztStatus;
    }

    public Integer getWfStatus() {
        return wfStatus;
    }

    public void setWfStatus(Integer wfStatus) {
        this.wfStatus = wfStatus;
    }

    public Integer getIdCheckStatus() {
        return idCheckStatus;
    }

    public void setIdCheckStatus(Integer idCheckStatus) {
        this.idCheckStatus = idCheckStatus;
    }

    public String getIdCheckPhoto() {
        return idCheckPhoto;
    }

    public void setIdCheckPhoto(String idCheckPhoto) {
        this.idCheckPhoto = idCheckPhoto;
    }

    public Integer getLogo() {
        return logo;
    }

    public void setLogo(Integer logo) {
        this.logo = logo;
    }

    public Integer getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(Integer idCheck) {
        this.idCheck = idCheck;
    }

    public Integer getPairResult() {
        return pairResult;
    }

    public void setPairResult(Integer pairResult) {
        this.pairResult = pairResult;
    }

    public String getPairSimilarity() {
        return pairSimilarity;
    }

    public void setPairSimilarity(String pairSimilarity) {
        this.pairSimilarity = pairSimilarity;
    }

    public Integer getTelStatus() {
        return telStatus;
    }

    public void setTelStatus(Integer telStatus) {
        this.telStatus = telStatus;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public Integer getAuthResult() {
        return authResult;
    }

    public void setAuthResult(Integer authResult) {
        this.authResult = authResult;
    }

    public String getRegistAddr() {
        return registAddr;
    }

    public void setRegistAddr(String registAddr) {
        this.registAddr = registAddr;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getNicknameStatus() {
        return nicknameStatus;
    }

    public void setNicknameStatus(Integer nicknameStatus) {
        this.nicknameStatus = nicknameStatus;
    }

    public Integer getUserAgentType() {
        return userAgentType;
    }

    public void setUserAgentType(Integer userAgentType) {
        this.userAgentType = userAgentType;
    }

    public Integer getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    public String getSyncMessage() {
        return syncMessage;
    }

    public void setSyncMessage(String syncMessage) {
        this.syncMessage = syncMessage;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        ", id=" + id +
        ", username=" + username +
        ", pwd=" + pwd +
        ", salt=" + salt +
        ", type=" + type +
        ", card=" + card +
        ", realName=" + realName +
        ", sex=" + sex +
        ", policeCode=" + policeCode +
        ", starLevel=" + starLevel +
        ", source=" + source +
        ", createdTime=" + createdTime +
        ", updatedTime=" + updatedTime +
        ", creator=" + creator +
        ", updator=" + updator +
        ", rpath=" + rpath +
        ", status=" + status +
        ", staffType=" + staffType +
        ", hiredate=" + hiredate +
        ", residencet=" + residencet +
        ", domicile=" + domicile +
        ", degree=" + degree +
        ", salarySource=" + salarySource +
        ", marital=" + marital +
        ", remark=" + remark +
        ", league=" + league +
        ", salary=" + salary +
        ", orderNum=" + orderNum +
        ", cardFront=" + cardFront +
        ", cardBack=" + cardBack +
        ", cardPhoto=" + cardPhoto +
        ", workUnit=" + workUnit +
        ", occupation=" + occupation +
        ", telephone=" + telephone +
        ", referrer=" + referrer +
        ", birthday=" + birthday +
        ", major=" + major +
        ", specialty=" + specialty +
        ", resume=" + resume +
        ", area=" + area +
        ", nation=" + nation +
        ", iosToken=" + iosToken +
        ", ztStatus=" + ztStatus +
        ", wfStatus=" + wfStatus +
        ", idCheckStatus=" + idCheckStatus +
        ", idCheckPhoto=" + idCheckPhoto +
        ", logo=" + logo +
        ", idCheck=" + idCheck +
        ", pairResult=" + pairResult +
        ", pairSimilarity=" + pairSimilarity +
        ", telStatus=" + telStatus +
        ", authType=" + authType +
        ", authResult=" + authResult +
        ", registAddr=" + registAddr +
        ", loginStatus=" + loginStatus +
        ", nickname=" + nickname +
        ", signature=" + signature +
        ", nicknameStatus=" + nicknameStatus +
        ", userAgentType=" + userAgentType +
        ", syncStatus=" + syncStatus +
        ", syncMessage=" + syncMessage +
        "}";
    }
}
