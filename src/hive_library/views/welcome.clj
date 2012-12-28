(ns hive-library.views.welcome
  (:require [hive-library.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hive-library.models.books :only [fav-books]]
        [hive-library.views.books :only [fav-book-list]]))

(defpage "/" []
         (common/layout
           [:div.twelve.columns
            [:h1.remove-bottom {:style "margin-top: 0.25em"} "welcome to mikey's library"]
            [:hr]]
           [:div.four.columns
            [:nav {:style "margin-top: 2.55em"}
             [:a {:href "/"} "return home"]]]
           [:div.seven.columns
            [:h2 "what is this?"]
            [:p "i believe that the gift of learning is the best gift possible, so i want to share the resources i have with others by giving learning materials to anyone who wants to receive them."]
            [:hr]]
           [:div.seven.columns.offset-by-one
            [:h2 "how does it work?"]
            [:p "to receive physical copies of any book, especially those listed below, contact me at <span>dino****@riseup.net</span><script type='text/javascript'>var a = new Array('t','ne','p.','eu','is','@r','ur','sa','di','no');var scripts = document.getElementsByTagName('script');scripts[scripts.length-1].previousSibling.innerHTML = \"<a href='mailto:\"+a[8]+a[9]+a[7]+a[6]+a[5]+a[4]+a[3]+a[2]+a[1]+a[0]+\"'>\"+a[8]+a[9]+a[7]+a[6]+a[5]+a[4]+a[3]+a[2]+a[1]+a[0]+\"</a>\";</script>."]
            [:p "also feel free to browse my library of <a href=\"/ebooks/\">ebooks</a>."]
            [:hr]]
           [:div.sixteen.columns
            (fav-book-list (fav-books))]))
