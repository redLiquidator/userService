package org.egovframe.cloud.userservice.domain.role;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoleAuthorization is a Querydsl query type for RoleAuthorization
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoleAuthorization extends EntityPathBase<RoleAuthorization> {

    private static final long serialVersionUID = -698517980L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoleAuthorization roleAuthorization = new QRoleAuthorization("roleAuthorization");

    public final QAuthorization authorization;

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final QRoleAuthorizationId roleAuthorizationId;

    public QRoleAuthorization(String variable) {
        this(RoleAuthorization.class, forVariable(variable), INITS);
    }

    public QRoleAuthorization(Path<? extends RoleAuthorization> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoleAuthorization(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoleAuthorization(PathMetadata metadata, PathInits inits) {
        this(RoleAuthorization.class, metadata, inits);
    }

    public QRoleAuthorization(Class<? extends RoleAuthorization> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.authorization = inits.isInitialized("authorization") ? new QAuthorization(forProperty("authorization")) : null;
        this.roleAuthorizationId = inits.isInitialized("roleAuthorizationId") ? new QRoleAuthorizationId(forProperty("roleAuthorizationId")) : null;
    }

}

