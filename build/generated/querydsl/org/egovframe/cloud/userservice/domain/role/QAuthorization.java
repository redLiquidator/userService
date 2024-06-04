package org.egovframe.cloud.userservice.domain.role;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuthorization is a Querydsl query type for Authorization
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAuthorization extends EntityPathBase<Authorization> {

    private static final long serialVersionUID = 956448634L;

    public static final QAuthorization authorization = new QAuthorization("authorization");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    public final StringPath authorizationName = createString("authorizationName");

    public final NumberPath<Integer> authorizationNo = createNumber("authorizationNo", Integer.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath httpMethodCode = createString("httpMethodCode");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final ListPath<RoleAuthorization, QRoleAuthorization> roleAuthorizations = this.<RoleAuthorization, QRoleAuthorization>createList("roleAuthorizations", RoleAuthorization.class, QRoleAuthorization.class, PathInits.DIRECT2);

    public final NumberPath<Integer> sortSeq = createNumber("sortSeq", Integer.class);

    public final StringPath urlPatternValue = createString("urlPatternValue");

    public QAuthorization(String variable) {
        super(Authorization.class, forVariable(variable));
    }

    public QAuthorization(Path<? extends Authorization> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthorization(PathMetadata metadata) {
        super(Authorization.class, metadata);
    }

}

