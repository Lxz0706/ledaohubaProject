package com.ledao.project.system.judicial.domain;


import com.ledao.framework.web.domain.BaseEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 司法表 sys_judicial
 *
 * @author lxz
 * @date 2020-05-21
 */
public class Judicial extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;
    /**
     * 所有人
     */
    private String owner;
    /**
     * 所有人类型
     */
    private String ownerType;
    /**
     * 网站链接
     */
    private String websiteLinks;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setWebsiteLinks(String websiteLinks) {
        this.websiteLinks = websiteLinks;
    }

    public String getWebsiteLinks() {
        return websiteLinks;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("owner", getOwner())
                .append("ownerType", getOwnerType())
                .append("websiteLinks", getWebsiteLinks())
                .toString();
    }
}
