(ns dropbox-challenge.core-test)

(use '[lazytest.describe :only (describe it given)])
(use 'dropbox-challenge.core)

(describe "File parsing"
	(it "should not read any lines"
		(= {} (parse "0"))))