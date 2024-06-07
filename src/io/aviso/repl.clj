(ns io.aviso.repl
  "A shim to emulate a few key functions from io.aviso/pretty against org.clj-commons/pretty."
  {:added "1.0.0"}
  (:require [clj-commons.pretty.repl :as repl]))

(defn install-pretty-exceptions
  []
  (repl/install-pretty-exceptions))

(defn uncaught-exception-handler
  []
  (repl/uncaught-exception-handler))
