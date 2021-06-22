## cljs.user reload issue

1. `npm i`
2. `npx shadow-cljs watch frontend`
2. visit http://localhost:8082/
2. (in another terminal) `npx shadow-cljs cljs-repl frontend`
2. evaluate `cljs.user/foo` in repl => success!
2. edit src/foo/bar.cljs and eg change `baz` to 42
2. evaluate `foo.bar/baz` in repl => success!
2. edit `src/cljs/user.cljs` and change eg `foo` to 117
2. evaluate `cljs.user/foo` (or anything else for that matter) in repl => boom!


