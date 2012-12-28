(ns hive-library.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css doctype]]))

(defpartial layout [& content]
(doctype :html5)
"<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->"
"<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->"
"<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->"
"<!--[if (gte IE 9)|!(IE)]<!--><html lang=\"en\"> <!--<![endif]-->"
 [:head
  ; basic page needs
  [:meta {:charset "utf-8"}]
  [:title "mikey's library"]
  [:meta {:content "a free book lending library for everyone", :name "description"}]
  [:meta {:content "michael williams", :name "author"}]
  ; mobile specific metas
  [:meta
   {:content "width=device-width, initial-scale=1, maximum-scale=1",
    :name "viewport"}]
  ; css
  [:link {:href "/style/css/base.css", :rel "stylesheet"}]
  [:link {:href "/style/css/skeleton.css", :rel "stylesheet"}]
  [:link {:href "/style/css/layout.css", :rel "stylesheet"}]
  "<!--[if lt IE 9]>\n\t\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n\t<![endif]-->"
  ; favicon
  [:link {:href "/media/favicon.ico", :rel "shortcut icon"}]]
 [:body
  [:div.container
   content
   [:div.sixteen.columns
    [:a {:rel "license" :href "http://creativecommons.org/licenses/by-sa/3.0/"}
     [:img {:alt "cc-by-sa licensed" :src "/media/80x15/cc-by-sa.png"}]]
    [:a {:href "http://opensource.org/osd"}
     [:img {:alt "open source" :src "/media/80x15/opensource.png"}]]
    [:a {:href "http://debian.org"}
     [:img {:alt "debian badge" :src "/media/80x15/debian.png"}]]
    [:a {:href "http://github.com/ahdinosaur"}
     [:img {:alt "github badge" :src "/media/80x15/github.png"}]]
    [:a {:href "http://nginx.org"}
     [:img {:alt "nginx powered" :src "/media/80x15/nginx.png"}]]
    [:a {:href "http://linode.com"}
     [:img {:alt "linode powered" :src "/media/80x15/linode.png"}]]
    [:a {:href "http://ipv6-test.com/validate.php?url=https://www.dinosaur.io/library"}
     [:img {:alt "ipv6 ready" :src "/media/80x15/ipv6.png"}]]
    [:a {:href "http://validator.w3.org/check?uri=https://www.dinosaur.io/library"}
     [:img {:alt "valid html5" :src "/media/80x15/html5.png"}]]
    [:a {:href "http://jigsaw.w3.org/css-validator/validator?uri=https://www.dinosaur.io/library&amp;profile=css3"}
     [:img {:alt "valid css3" :src "/media/80x15/css3.png"}]]]
  "<!-- container -->"]])
