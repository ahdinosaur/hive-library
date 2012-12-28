(ns hive-library.views.books
  (:use [noir.core :only [defpartial]]))

(defpartial book-item
            [{:keys [isbn-10 isbn-13 title author publisher num-pages ebook]}]
            [:li
             [:h3 title]
             [:h4 author]
             [:ul.disc
              (if ebook
                [:li [:a {:href ebook} "ebook"]])
              [:li "isbn-10: " isbn-10]
              [:li "isbn-13: " isbn-13]
              [:li "publisher: " publisher]
              [:li "# of pages: " num-pages]]])

(defpartial fav-book-list
            [books]
            [:h2 "my favorite books:"]
            [:ul.square
             (map book-item books)])
