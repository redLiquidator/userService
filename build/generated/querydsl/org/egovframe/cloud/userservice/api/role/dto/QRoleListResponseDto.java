package org.egovframe.cloud.userservice.api.role.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.userservice.api.role.dto.QRoleListResponseDto is a Querydsl Projection type for RoleListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRoleListResponseDto extends ConstructorExpression<RoleListResponseDto> {

    private static final long serialVersionUID = -1667881432L;

    public QRoleListResponseDto(com.querydsl.core.types.Expression<String> roleId, com.querydsl.core.types.Expression<String> roleName, com.querydsl.core.types.Expression<String> roleContent, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate) {
        super(RoleListResponseDto.class, new Class<?>[]{String.class, String.class, String.class, java.time.LocalDateTime.class}, roleId, roleName, roleContent, createdDate);
    }

}

