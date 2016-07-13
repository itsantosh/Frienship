/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.friendship.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author santosh
 */
@Entity
@Table(name = "tbl_menu", catalog = "friend_ship", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m"),
    @NamedQuery(name = "Menu.findByMenuId", query = "SELECT m FROM Menu m WHERE m.menuId = :menuId"),
    @NamedQuery(name = "Menu.findByMenuName", query = "SELECT m FROM Menu m WHERE m.menuName = :menuName"),
    @NamedQuery(name = "Menu.findByMenuPrice", query = "SELECT m FROM Menu m WHERE m.menuPrice = :menuPrice")})
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "menu_id", nullable = false)
    private Integer menuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "menu_name", nullable = false, length = 255)
    private String menuName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "menu_description", nullable = false, length = 65535)
    private String menuDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "menu_price", nullable = false)
    private long menuPrice;

    public Menu() {
    }

    public Menu(Integer menuId) {
        this.menuId = menuId;
    }

    public Menu(Integer menuId, String menuName, String menuDescription, long menuPrice) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuDescription = menuDescription;
        this.menuPrice = menuPrice;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public long getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(long menuPrice) {
        this.menuPrice = menuPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuId != null ? menuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.menuId == null && other.menuId != null) || (this.menuId != null && !this.menuId.equals(other.menuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.santosh.friendship.entity.Menu[ menuId=" + menuId + " ]";
    }
    
}
