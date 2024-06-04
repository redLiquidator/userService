package org.egovframe.cloud.userservice.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserFindPassword is a Querydsl query type for UserFindPassword
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserFindPassword extends EntityPathBase<UserFindPassword> {

    private static final long serialVersionUID = 466416009L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserFindPassword userFindPassword = new QUserFindPassword("userFindPassword");

    public final org.egovframe.cloud.servlet.domain.QBaseTimeEntity _super = new org.egovframe.cloud.servlet.domain.QBaseTimeEntity(this);

    public final BooleanPath changeAt = createBoolean("changeAt");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath tokenValue = createString("tokenValue");

    public final QUserFindPasswordId userFindPasswordId;

    public QUserFindPassword(String variable) {
        this(UserFindPassword.class, forVariable(variable), INITS);
    }

    public QUserFindPassword(Path<? extends UserFindPassword> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserFindPassword(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserFindPassword(PathMetadata metadata, PathInits inits) {
        this(UserFindPassword.class, metadata, inits);
    }

    public QUserFindPassword(Class<? extends UserFindPassword> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userFindPasswordId = inits.isInitialized("userFindPasswordId") ? new QUserFindPasswordId(forProperty("userFindPasswordId")) : null;
    }

}

