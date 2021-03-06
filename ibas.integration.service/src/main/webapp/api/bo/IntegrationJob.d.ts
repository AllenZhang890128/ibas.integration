/**
 * @license
 * Copyright color-coding studio. All Rights Reserved.
 *
 * Use of this source code is governed by an Apache License, Version 2.0
 * that can be found in the LICENSE file at http://www.apache.org/licenses/LICENSE-2.0
 */

import {
    emYesNo,
    emDocumentStatus,
    emBOStatus,
    emApprovalStatus,
    IBusinessObject,
    IBusinessObjects,
    IBOMasterData,
    IBOMasterDataLine,
    IBODocument,
    IBODocumentLine,
    IBOSimple,
    IBOSimpleLine
} from "ibas/index";
import {

} from "../Datas";

/** 集成任务 */
export interface IIntegrationJob extends IBOSimple {

    /** 服务的名称 */
    jobName: string;

    /** 是否激活 */
    activated: emYesNo;

    /** 频率 */
    frequency: number;

    /** 关联的业务对象 */
    boCode: string;

    /** 关联的应用 */
    applicationId: string;

    /** 备注 */
    remarks: string;

    /** 对象编号 */
    objectKey: number;

    /** 对象类型 */
    objectCode: string;

    /** 实例号 */
    logInst: number;

    /** 服务系列 */
    series: number;

    /** 数据源 */
    dataSource: string;

    /** 创建日期 */
    createDate: Date;

    /** 创建时间 */
    createTime: number;

    /** 更新日期 */
    updateDate: Date;

    /** 更新时间 */
    updateTime: number;

    /** 创建用户 */
    createUserSign: number;

    /** 更新用户 */
    updateUserSign: number;

    /** 创建动作标识 */
    createActionId: string;

    /** 更新动作标识 */
    updateActionId: string;

    /** 数据所有者 */
    dataOwner: number;

    /** 团队成员 */
    teamMembers: string;

    /** 数据所属组织 */
    organization: string;


    /** 集成任务-动作集合 */
    integrationJobActions: IIntegrationJobActions;


}

/** 集成任务-动作 集合 */
export interface IIntegrationJobActions extends IBusinessObjects<IIntegrationJobAction, IIntegrationJob> {

    /** 创建并添加子项 */
    create(): IIntegrationJobAction;
}

/** 集成任务-动作 */
export interface IIntegrationJobAction extends IBOSimpleLine {

    /** 对象编号 */
    objectKey: number;

    /** 对象行号 */
    lineId: number;

    /** 对象类型 */
    objectCode: string;

    /** 实例号 */
    logInst: number;

    /** 数据源 */
    dataSource: string;

    /** 创建日期 */
    createDate: Date;

    /** 创建时间 */
    createTime: number;

    /** 更新日期 */
    updateDate: Date;

    /** 更新时间 */
    updateTime: number;

    /** 创建用户 */
    createUserSign: number;

    /** 更新用户 */
    updateUserSign: number;

    /** 创建动作标识 */
    createActionId: string;

    /** 更新动作标识 */
    updateActionId: string;

    /** 任务项标识 */
    actionID: string;

    /** 任务项名称 */
    actionName: string;


    /** 集成任务-动作-配置集合 */
    integrationJobActionCfgs: IIntegrationJobActionCfgs;


}

/** 集成任务-动作-配置 集合 */
export interface IIntegrationJobActionCfgs extends IBusinessObjects<IIntegrationJobActionCfg, IIntegrationJobAction> {

    /** 创建并添加子项 */
    create(): IIntegrationJobActionCfg;
}

/** 集成任务-动作-配置 */
export interface IIntegrationJobActionCfg extends IBOSimpleLine {

    /** 对象编号 */
    objectKey: number;

    /** 对象行号 */
    lineId: number;

    /** 对象类型 */
    objectCode: string;

    /** 实例号 */
    logInst: number;

    /** 数据源 */
    dataSource: string;

    /** 创建日期 */
    createDate: Date;

    /** 创建时间 */
    createTime: number;

    /** 更新日期 */
    updateDate: Date;

    /** 更新时间 */
    updateTime: number;

    /** 创建用户 */
    createUserSign: number;

    /** 更新用户 */
    updateUserSign: number;

    /** 创建动作标识 */
    createActionId: string;

    /** 更新动作标识 */
    updateActionId: string;

    /** 动作行号 */
    actionLineId: number;

    /** 配置项健 */
    key: string;

    /** 配置项值 */
    value: string;


}


