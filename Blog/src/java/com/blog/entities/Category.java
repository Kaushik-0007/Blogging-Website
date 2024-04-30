/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.blog.entities;

public class Category {
    private final int cid;
    private final String name;
    private final String description;

    private Category(Builder builder) {
        this.cid = builder.cid;
        this.name = builder.name;
        this.description = builder.description;
    }

    public int getCid() {
        return cid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private int cid;
        private String name;
        private String description;

        public Builder(int cid, String name, String description) {
            this.cid = cid;
            this.name = name;
            this.description = description;
        }

        public Category build() {
            return new Category(this);
        }
    }
}



