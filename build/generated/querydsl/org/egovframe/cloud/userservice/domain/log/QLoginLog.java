package org.egovframe.cloud.userservice.domain.log;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLoginLog is a Querydsl query type for LoginLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLoginLog extends EntityPathBase<LoginLog> {

    private static final long serialVersionUID = -512272386L;

    public static final QLoginLog loginLog = new QLoginLog("loginLog");

    public final org.egovframe.cloud.servlet.domain.QBaseTimeEntity _super = new org.egovframe.cloud.servlet.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    public final StringPath failContent = createString("failContent");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath remoteIp = createString("remoteIp");

    public final NumberPath<Long> siteId = createNumber("siteId", Long.class);

    public final BooleanPath successAt = createBoolean("successAt");

    public QLoginLog(String variable) {
        super(LoginLog.class, forVariable(variable));
    }

    public QLoginLog(Path<? extends LoginLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLoginLog(PathMetadata metadata) {
        super(LoginLog.class, metadata);
    }

}

