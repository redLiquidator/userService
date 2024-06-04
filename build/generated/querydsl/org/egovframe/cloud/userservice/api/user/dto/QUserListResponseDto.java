package org.egovframe.cloud.userservice.api.user.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.userservice.api.user.dto.QUserListResponseDto is a Querydsl Projection type for UserListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QUserListResponseDto extends ConstructorExpression<UserListResponseDto> {

    private static final long serialVersionUID = -1193672056L;

    public QUserListResponseDto(com.querydsl.core.types.Expression<String> userId, com.querydsl.core.types.Expression<String> userName, com.querydsl.core.types.Expression<String> email, com.querydsl.core.types.Expression<org.egovframe.cloud.common.domain.Role> role, com.querydsl.core.types.Expression<String> userStateCode, com.querydsl.core.types.Expression<java.time.LocalDateTime> lastLoginDate, com.querydsl.core.types.Expression<Integer> loginFailCount) {
        super(UserListResponseDto.class, new Class<?>[]{String.class, String.class, String.class, org.egovframe.cloud.common.domain.Role.class, String.class, java.time.LocalDateTime.class, int.class}, userId, userName, email, role, userStateCode, lastLoginDate, loginFailCount);
    }

}

