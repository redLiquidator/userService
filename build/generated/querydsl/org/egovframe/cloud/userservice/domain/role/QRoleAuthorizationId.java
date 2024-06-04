package org.egovframe.cloud.userservice.domain.role;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleAuthorizationId is a Querydsl query type for RoleAuthorizationId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRoleAuthorizationId extends BeanPath<RoleAuthorizationId> {

    private static final long serialVersionUID = -1260878241L;

    public static final QRoleAuthorizationId roleAuthorizationId = new QRoleAuthorizationId("roleAuthorizationId");

    public final NumberPath<Integer> authorizationNo = createNumber("authorizationNo", Integer.class);

    public final StringPath roleId = createString("roleId");

    public QRoleAuthorizationId(String variable) {
        super(RoleAuthorizationId.class, forVariable(variable));
    }

    public QRoleAuthorizationId(Path<? extends RoleAuthorizationId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleAuthorizationId(PathMetadata metadata) {
        super(RoleAuthorizationId.class, metadata);
    }

}

