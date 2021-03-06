package org.colorcoding.ibas.integration.bo.integrationjob;

import javax.xml.bind.annotation.*;

import org.colorcoding.ibas.bobas.core.*;
import org.colorcoding.ibas.bobas.mapping.*;
import org.colorcoding.ibas.bobas.bo.*;
import org.colorcoding.ibas.bobas.data.*;
import org.colorcoding.ibas.integration.MyConsts;
import org.colorcoding.ibas.integration.data.*;

/**
* 获取-集成任务
* 
*/
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = IntegrationJob.BUSINESS_OBJECT_NAME, namespace = MyConsts.NAMESPACE_BO)
@XmlRootElement(name = IntegrationJob.BUSINESS_OBJECT_NAME, namespace = MyConsts.NAMESPACE_BO)
@BOCode(IntegrationJob.BUSINESS_OBJECT_CODE)
public class IntegrationJob extends BusinessObject<IntegrationJob> implements IIntegrationJob {

    /**
     * 序列化版本标记
     */
    private static final long serialVersionUID = 4958915964428100425L;

    /**
    * 当前类型
    */
    private static final Class<?> MY_CLASS = IntegrationJob.class;

    /**
    * 数据库表
    */
    public static final String DB_TABLE_NAME = "${Company}_IG_OJOB";

    /**
    * 业务对象编码
    */
    public static final String BUSINESS_OBJECT_CODE = "${Company}_IG_INTERGRATIONJOB";

    /**
    * 业务对象名称
    */
    public static final String BUSINESS_OBJECT_NAME = "IntegrationJob";

    /**
    * 属性名称-服务的名称
    */
    private static final String PROPERTY_JOBNAME_NAME = "JobName";

    /**
    * 服务的名称 属性
    */
    @DbField(name = "JobName", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_JOBNAME = registerProperty(PROPERTY_JOBNAME_NAME, String.class, MY_CLASS);

    /**
    * 获取-服务的名称
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_JOBNAME_NAME)
    public final String getJobName() {
        return this.getProperty(PROPERTY_JOBNAME);
    }

    /**
    * 设置-服务的名称
    * 
    * @param value 值
    */
    public final void setJobName(String value) {
        this.setProperty(PROPERTY_JOBNAME, value);
    }


    /**
    * 属性名称-是否激活
    */
    private static final String PROPERTY_ACTIVATED_NAME = "Activated";

    /**
    * 是否激活 属性
    */
    @DbField(name = "Activated", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<emYesNo> PROPERTY_ACTIVATED = registerProperty(PROPERTY_ACTIVATED_NAME, emYesNo.class, MY_CLASS);

    /**
    * 获取-是否激活
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_ACTIVATED_NAME)
    public final emYesNo getActivated() {
        return this.getProperty(PROPERTY_ACTIVATED);
    }

    /**
    * 设置-是否激活
    * 
    * @param value 值
    */
    public final void setActivated(emYesNo value) {
        this.setProperty(PROPERTY_ACTIVATED, value);
    }


    /**
    * 属性名称-频率
    */
    private static final String PROPERTY_FREQUENCY_NAME = "Frequency";

    /**
    * 频率 属性
    */
    @DbField(name = "Frequency", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Integer> PROPERTY_FREQUENCY = registerProperty(PROPERTY_FREQUENCY_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-频率
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_FREQUENCY_NAME)
    public final Integer getFrequency() {
        return this.getProperty(PROPERTY_FREQUENCY);
    }

    /**
    * 设置-频率
    * 
    * @param value 值
    */
    public final void setFrequency(Integer value) {
        this.setProperty(PROPERTY_FREQUENCY, value);
    }


    /**
    * 属性名称-关联的业务对象
    */
    private static final String PROPERTY_BOCODE_NAME = "BOCode";

    /**
    * 关联的业务对象 属性
    */
    @DbField(name = "BOCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_BOCODE = registerProperty(PROPERTY_BOCODE_NAME, String.class, MY_CLASS);

    /**
    * 获取-关联的业务对象
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_BOCODE_NAME)
    public final String getBOCode() {
        return this.getProperty(PROPERTY_BOCODE);
    }

    /**
    * 设置-关联的业务对象
    * 
    * @param value 值
    */
    public final void setBOCode(String value) {
        this.setProperty(PROPERTY_BOCODE, value);
    }


    /**
    * 属性名称-关联的应用
    */
    private static final String PROPERTY_APPLICATIONID_NAME = "ApplicationId";

    /**
    * 关联的应用 属性
    */
    @DbField(name = "AppId", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_APPLICATIONID = registerProperty(PROPERTY_APPLICATIONID_NAME, String.class, MY_CLASS);

    /**
    * 获取-关联的应用
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_APPLICATIONID_NAME)
    public final String getApplicationId() {
        return this.getProperty(PROPERTY_APPLICATIONID);
    }

    /**
    * 设置-关联的应用
    * 
    * @param value 值
    */
    public final void setApplicationId(String value) {
        this.setProperty(PROPERTY_APPLICATIONID, value);
    }


    /**
    * 属性名称-备注
    */
    private static final String PROPERTY_REMARKS_NAME = "Remarks";

    /**
    * 备注 属性
    */
    @DbField(name = "Remarks", type = DbFieldType.MEMO, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_REMARKS = registerProperty(PROPERTY_REMARKS_NAME, String.class, MY_CLASS);

    /**
    * 获取-备注
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_REMARKS_NAME)
    public final String getRemarks() {
        return this.getProperty(PROPERTY_REMARKS);
    }

    /**
    * 设置-备注
    * 
    * @param value 值
    */
    public final void setRemarks(String value) {
        this.setProperty(PROPERTY_REMARKS, value);
    }


    /**
    * 属性名称-对象编号
    */
    private static final String PROPERTY_OBJECTKEY_NAME = "ObjectKey";

    /**
    * 对象编号 属性
    */
    @DbField(name = "ObjectKey", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = true)
    public static final IPropertyInfo<Integer> PROPERTY_OBJECTKEY = registerProperty(PROPERTY_OBJECTKEY_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-对象编号
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_OBJECTKEY_NAME)
    public final Integer getObjectKey() {
        return this.getProperty(PROPERTY_OBJECTKEY);
    }

    /**
    * 设置-对象编号
    * 
    * @param value 值
    */
    public final void setObjectKey(Integer value) {
        this.setProperty(PROPERTY_OBJECTKEY, value);
    }


    /**
    * 属性名称-对象类型
    */
    private static final String PROPERTY_OBJECTCODE_NAME = "ObjectCode";

    /**
    * 对象类型 属性
    */
    @DbField(name = "ObjectCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_OBJECTCODE = registerProperty(PROPERTY_OBJECTCODE_NAME, String.class, MY_CLASS);

    /**
    * 获取-对象类型
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_OBJECTCODE_NAME)
    public final String getObjectCode() {
        return this.getProperty(PROPERTY_OBJECTCODE);
    }

    /**
    * 设置-对象类型
    * 
    * @param value 值
    */
    public final void setObjectCode(String value) {
        this.setProperty(PROPERTY_OBJECTCODE, value);
    }


    /**
    * 属性名称-实例号
    */
    private static final String PROPERTY_LOGINST_NAME = "LogInst";

    /**
    * 实例号 属性
    */
    @DbField(name = "LogInst", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Integer> PROPERTY_LOGINST = registerProperty(PROPERTY_LOGINST_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-实例号
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_LOGINST_NAME)
    public final Integer getLogInst() {
        return this.getProperty(PROPERTY_LOGINST);
    }

    /**
    * 设置-实例号
    * 
    * @param value 值
    */
    public final void setLogInst(Integer value) {
        this.setProperty(PROPERTY_LOGINST, value);
    }


    /**
    * 属性名称-服务系列
    */
    private static final String PROPERTY_SERIES_NAME = "Series";

    /**
    * 服务系列 属性
    */
    @DbField(name = "Series", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Integer> PROPERTY_SERIES = registerProperty(PROPERTY_SERIES_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-服务系列
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_SERIES_NAME)
    public final Integer getSeries() {
        return this.getProperty(PROPERTY_SERIES);
    }

    /**
    * 设置-服务系列
    * 
    * @param value 值
    */
    public final void setSeries(Integer value) {
        this.setProperty(PROPERTY_SERIES, value);
    }


    /**
    * 属性名称-数据源
    */
    private static final String PROPERTY_DATASOURCE_NAME = "DataSource";

    /**
    * 数据源 属性
    */
    @DbField(name = "DataSource", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_DATASOURCE = registerProperty(PROPERTY_DATASOURCE_NAME, String.class, MY_CLASS);

    /**
    * 获取-数据源
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_DATASOURCE_NAME)
    public final String getDataSource() {
        return this.getProperty(PROPERTY_DATASOURCE);
    }

    /**
    * 设置-数据源
    * 
    * @param value 值
    */
    public final void setDataSource(String value) {
        this.setProperty(PROPERTY_DATASOURCE, value);
    }


    /**
    * 属性名称-创建日期
    */
    private static final String PROPERTY_CREATEDATE_NAME = "CreateDate";

    /**
    * 创建日期 属性
    */
    @DbField(name = "CreateDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<DateTime> PROPERTY_CREATEDATE = registerProperty(PROPERTY_CREATEDATE_NAME, DateTime.class, MY_CLASS);

    /**
    * 获取-创建日期
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_CREATEDATE_NAME)
    public final DateTime getCreateDate() {
        return this.getProperty(PROPERTY_CREATEDATE);
    }

    /**
    * 设置-创建日期
    * 
    * @param value 值
    */
    public final void setCreateDate(DateTime value) {
        this.setProperty(PROPERTY_CREATEDATE, value);
    }


    /**
    * 属性名称-创建时间
    */
    private static final String PROPERTY_CREATETIME_NAME = "CreateTime";

    /**
    * 创建时间 属性
    */
    @DbField(name = "CreateTime", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Short> PROPERTY_CREATETIME = registerProperty(PROPERTY_CREATETIME_NAME, Short.class, MY_CLASS);

    /**
    * 获取-创建时间
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_CREATETIME_NAME)
    public final Short getCreateTime() {
        return this.getProperty(PROPERTY_CREATETIME);
    }

    /**
    * 设置-创建时间
    * 
    * @param value 值
    */
    public final void setCreateTime(Short value) {
        this.setProperty(PROPERTY_CREATETIME, value);
    }


    /**
    * 属性名称-更新日期
    */
    private static final String PROPERTY_UPDATEDATE_NAME = "UpdateDate";

    /**
    * 更新日期 属性
    */
    @DbField(name = "UpdateDate", type = DbFieldType.DATE, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<DateTime> PROPERTY_UPDATEDATE = registerProperty(PROPERTY_UPDATEDATE_NAME, DateTime.class, MY_CLASS);

    /**
    * 获取-更新日期
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_UPDATEDATE_NAME)
    public final DateTime getUpdateDate() {
        return this.getProperty(PROPERTY_UPDATEDATE);
    }

    /**
    * 设置-更新日期
    * 
    * @param value 值
    */
    public final void setUpdateDate(DateTime value) {
        this.setProperty(PROPERTY_UPDATEDATE, value);
    }


    /**
    * 属性名称-更新时间
    */
    private static final String PROPERTY_UPDATETIME_NAME = "UpdateTime";

    /**
    * 更新时间 属性
    */
    @DbField(name = "UpdateTime", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Short> PROPERTY_UPDATETIME = registerProperty(PROPERTY_UPDATETIME_NAME, Short.class, MY_CLASS);

    /**
    * 获取-更新时间
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_UPDATETIME_NAME)
    public final Short getUpdateTime() {
        return this.getProperty(PROPERTY_UPDATETIME);
    }

    /**
    * 设置-更新时间
    * 
    * @param value 值
    */
    public final void setUpdateTime(Short value) {
        this.setProperty(PROPERTY_UPDATETIME, value);
    }


    /**
    * 属性名称-创建用户
    */
    private static final String PROPERTY_CREATEUSERSIGN_NAME = "CreateUserSign";

    /**
    * 创建用户 属性
    */
    @DbField(name = "Creator", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Integer> PROPERTY_CREATEUSERSIGN = registerProperty(PROPERTY_CREATEUSERSIGN_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-创建用户
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_CREATEUSERSIGN_NAME)
    public final Integer getCreateUserSign() {
        return this.getProperty(PROPERTY_CREATEUSERSIGN);
    }

    /**
    * 设置-创建用户
    * 
    * @param value 值
    */
    public final void setCreateUserSign(Integer value) {
        this.setProperty(PROPERTY_CREATEUSERSIGN, value);
    }


    /**
    * 属性名称-更新用户
    */
    private static final String PROPERTY_UPDATEUSERSIGN_NAME = "UpdateUserSign";

    /**
    * 更新用户 属性
    */
    @DbField(name = "Updator", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Integer> PROPERTY_UPDATEUSERSIGN = registerProperty(PROPERTY_UPDATEUSERSIGN_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-更新用户
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_UPDATEUSERSIGN_NAME)
    public final Integer getUpdateUserSign() {
        return this.getProperty(PROPERTY_UPDATEUSERSIGN);
    }

    /**
    * 设置-更新用户
    * 
    * @param value 值
    */
    public final void setUpdateUserSign(Integer value) {
        this.setProperty(PROPERTY_UPDATEUSERSIGN, value);
    }


    /**
    * 属性名称-创建动作标识
    */
    private static final String PROPERTY_CREATEACTIONID_NAME = "CreateActionId";

    /**
    * 创建动作标识 属性
    */
    @DbField(name = "CreateActId", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_CREATEACTIONID = registerProperty(PROPERTY_CREATEACTIONID_NAME, String.class, MY_CLASS);

    /**
    * 获取-创建动作标识
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_CREATEACTIONID_NAME)
    public final String getCreateActionId() {
        return this.getProperty(PROPERTY_CREATEACTIONID);
    }

    /**
    * 设置-创建动作标识
    * 
    * @param value 值
    */
    public final void setCreateActionId(String value) {
        this.setProperty(PROPERTY_CREATEACTIONID, value);
    }


    /**
    * 属性名称-更新动作标识
    */
    private static final String PROPERTY_UPDATEACTIONID_NAME = "UpdateActionId";

    /**
    * 更新动作标识 属性
    */
    @DbField(name = "UpdateActId", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_UPDATEACTIONID = registerProperty(PROPERTY_UPDATEACTIONID_NAME, String.class, MY_CLASS);

    /**
    * 获取-更新动作标识
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_UPDATEACTIONID_NAME)
    public final String getUpdateActionId() {
        return this.getProperty(PROPERTY_UPDATEACTIONID);
    }

    /**
    * 设置-更新动作标识
    * 
    * @param value 值
    */
    public final void setUpdateActionId(String value) {
        this.setProperty(PROPERTY_UPDATEACTIONID, value);
    }


    /**
    * 属性名称-数据所有者
    */
    private static final String PROPERTY_DATAOWNER_NAME = "DataOwner";

    /**
    * 数据所有者 属性
    */
    @DbField(name = "DataOwner", type = DbFieldType.NUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<Integer> PROPERTY_DATAOWNER = registerProperty(PROPERTY_DATAOWNER_NAME, Integer.class, MY_CLASS);

    /**
    * 获取-数据所有者
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_DATAOWNER_NAME)
    public final Integer getDataOwner() {
        return this.getProperty(PROPERTY_DATAOWNER);
    }

    /**
    * 设置-数据所有者
    * 
    * @param value 值
    */
    public final void setDataOwner(Integer value) {
        this.setProperty(PROPERTY_DATAOWNER, value);
    }


    /**
    * 属性名称-团队成员
    */
    private static final String PROPERTY_TEAMMEMBERS_NAME = "TeamMembers";

    /**
    * 团队成员 属性
    */
    @DbField(name = "TeamMembers", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_TEAMMEMBERS = registerProperty(PROPERTY_TEAMMEMBERS_NAME, String.class, MY_CLASS);

    /**
    * 获取-团队成员
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_TEAMMEMBERS_NAME)
    public final String getTeamMembers() {
        return this.getProperty(PROPERTY_TEAMMEMBERS);
    }

    /**
    * 设置-团队成员
    * 
    * @param value 值
    */
    public final void setTeamMembers(String value) {
        this.setProperty(PROPERTY_TEAMMEMBERS, value);
    }


    /**
    * 属性名称-数据所属组织
    */
    private static final String PROPERTY_ORGANIZATION_NAME = "Organization";

    /**
    * 数据所属组织 属性
    */
    @DbField(name = "OrgCode", type = DbFieldType.ALPHANUMERIC, table = DB_TABLE_NAME, primaryKey = false)
    public static final IPropertyInfo<String> PROPERTY_ORGANIZATION = registerProperty(PROPERTY_ORGANIZATION_NAME, String.class, MY_CLASS);

    /**
    * 获取-数据所属组织
    * 
    * @return 值
    */
    @XmlElement(name = PROPERTY_ORGANIZATION_NAME)
    public final String getOrganization() {
        return this.getProperty(PROPERTY_ORGANIZATION);
    }

    /**
    * 设置-数据所属组织
    * 
    * @param value 值
    */
    public final void setOrganization(String value) {
        this.setProperty(PROPERTY_ORGANIZATION, value);
    }



    /**
    * 属性名称-集成任务-动作
    */
    private static final String PROPERTY_INTEGRATIONJOBACTIONS_NAME = "IntegrationJobActions";

    /**
    * 集成任务-动作的集合属性
    * 
    */ 
    public static final IPropertyInfo<IIntegrationJobActions> PROPERTY_INTEGRATIONJOBACTIONS = registerProperty(PROPERTY_INTEGRATIONJOBACTIONS_NAME, IIntegrationJobActions.class, MY_CLASS);
    /**
    * 获取-集成任务-动作集合
    * 
    * @return 值
    */
    @XmlElementWrapper(name = PROPERTY_INTEGRATIONJOBACTIONS_NAME)
    @XmlElement(name = IntegrationJobAction.BUSINESS_OBJECT_NAME, type = IntegrationJobAction.class)
    public final IIntegrationJobActions getIntegrationJobActions() {
        return this.getProperty(PROPERTY_INTEGRATIONJOBACTIONS);
    }

    /**
    * 设置-集成任务-动作集合
    * 
    * @param value 值
    */
    public final void setIntegrationJobActions(IIntegrationJobActions value) {
        this.setProperty(PROPERTY_INTEGRATIONJOBACTIONS, value);
    }



    /**
    * 初始化数据
    */
    @Override
    protected void initialize() {
        super.initialize();// 基类初始化，不可去除
        this.setIntegrationJobActions(new IntegrationJobActions(this));
        this.setObjectCode(BUSINESS_OBJECT_CODE);

    }

}
