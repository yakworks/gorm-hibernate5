package org.grails.orm.hibernate.cfg;

import org.hibernate.cfg.NamingStrategy;

/**
 * Extended NamingStrategy that allows to change foreign key suffix, which is `_id` by default
 */
public interface ExtendedNamingStrategy extends NamingStrategy {

    public String getForeignKeySuffix();

}
