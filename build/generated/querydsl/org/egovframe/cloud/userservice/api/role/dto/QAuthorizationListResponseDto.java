package org.egovframe.cloud.userservice.api.role.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.userservice.api.role.dto.QAuthorizationListResponseDto is a Querydsl Projection type for AuthorizationListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QAuthorizationListResponseDto extends ConstructorExpression<AuthorizationListResponseDto> {

    private static final long serialVersionUID = 912509769L;

    public QAuthorizationListResponseDto(com.querydsl.core.types.Expression<Integer> authorizationNo, com.querydsl.core.types.Expression<String> authorizationName, com.querydsl.core.types.Expression<String> urlPatternValue, com.querydsl.core.types.Expression<String> httpMethodCode, com.querydsl.core.types.Expression<Integer> sortSeq) {
        super(AuthorizationListResponseDto.class, new Class<?>[]{int.class, String.class, String.class, String.class, int.class}, authorizationNo, authorizationName, urlPatternValue, httpMethodCode, sortSeq);
    }

}

