package com.example.myapplication.Util;

import java.util.List;

/**
 * Created by Administrator on 2016/2/6.
 */
public class PhotoModel {
    //当前页
    private int current_page;
    //总页数
    private int total_pages;
    //总条数
    private int total_items;
    //返回的照片详细数据
    private List<Photo> photos;

    private String feature;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public class Photo{
        //照片Id
        private String id;
        //照片上传用户Id
        private String user_id;
        //姓名
        private String name;
        //详细
        private String description;
        //照片宽
        private String width;
        //照片长
        private String height;
        //照片地址
        private String image_url;

        //照片信息
        private List<Images> images;

        public class Images{
            private int size;
            private String url;
            private String https_url;
            private String format;

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHttps_url() {
                return https_url;
            }

            public void setHttps_url(String https_url) {
                this.https_url = https_url;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public List<Images> getImages() {
            return images;
        }

        public void setImages(List<Images> images) {
            this.images = images;
        }
    }
}
