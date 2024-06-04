package org.egovframe.cloud.userservice.api.role.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.userservice.api.role.dto.QRoleAuthorizationListResponseDto is a Querydsl Projection type for RoleAuthorizationListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRoleAuthorizationListResponseDto extends ConstructorExpression<RoleAuthorizationListResponseDto> {

    private static final long serialVersionUID = -1325166113L;

    public QRoleAuthorizationListResponseDto(com.querydsl.core.types.Expression<String> roleId, com.querydsl.core.types.Expression<Integer> authorizationNo, com.querydsl.core.types.Expression<String> authorizationName, com.querydsl.core.types.Expression<String> urlPatternValue, com.querydsl.core.types.Expression<String> httpMethodCode, com.querydsl.core.types.Expression<Integer> sortSeq, com.querydsl.core.types.Expression<Boolean> createdAt) {
        super(RoleAuthorizationListResponseDto.class, new Class<?>[]{String.class, int.class, String.class, String.class, String.class, int.class, boolean.class}, roleId, authorizationNo, authorizationName, urlPatternValue, httpMethodCode, sortSeq, createdAt);
    }

}

