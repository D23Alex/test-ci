<script setup>
import { ref } from 'vue'

defineProps({
  msg: String,
})

const count = ref(0)
</script>

<script>
import axios from "axios";
export default {
  data() {
    return {
      hellos: []
    }
  },

  async mounted() {
    this.hellos = (await axios.get("http://158.160.139.212:8080/api/all-hellos")).data;
  }
}
</script>

<template>
  <h1>{{ msg }}</h1>
  <h2> {{ax}}</h2>
  <li v-for="hello in this.hellos">{{ hello }}</li>

  <div class="card">
    <button type="button" @click="count++">count is {{ count }}</button>
    <p>
      Edit
      <code>components/HelloWorld.vue</code> to test HMR
    </p>
  </div>

  <p>
    Check out
    <a href="https://vuejs.org/guide/quick-start.html#local" target="_blank"
      >create-vue</a
    >, the official Vue + Vite starter
  </p>
  <p>
    Install
    <a href="https://github.com/vuejs/language-tools" target="_blank">Volar</a>
    in your IDE for a better DX
  </p>
  <p class="read-the-docs">Click on the Vite and Vue logos to learn more</p>
</template>

<style scoped>
.read-the-docs {
  color: #888;
}
</style>
